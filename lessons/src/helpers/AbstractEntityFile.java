package helpers;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public abstract class AbstractEntityFile<T> {

    private final String DIR = "database/";

    protected final String DELIMITER = ";";

    /**
     * ------ Internal File Methods -----------------------------------------------
     */
    protected abstract String getFileName();

    protected abstract int getRecordSize();

    protected abstract String serialize();

    protected abstract T deserialize(String record);

    protected abstract boolean delete(int id);

    /**
     * ------ Data Access Object API ----------------------------------------------
     */
    public abstract ArrayList<T> all();

    public abstract T getById(int id);

    public abstract void save(T entity);

    /**
     * ------ Random Access File Utils ---------------------------------------
     */
    public File getFile() {
        File file = new File(DIR, this.getFileName());
        return file;
    }

    public int getLastRecordId() {
        File readFrom = this.getFile();
        try {
            RandomAccessFile raf = new RandomAccessFile(readFrom, "r");
            int pos = (int) raf.length();
            raf.close();
            return pos / (getRecordSize());
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /**
     * ------ Fundamental file methods ---------------------------------------
     */
    // Write a new record to the file
    public void create() {
        File writeTo = this.getFile();
        try {
            RandomAccessFile raf = new RandomAccessFile(writeTo, "rw");
            long pos = raf.length();
            raf.seek(pos);
            raf.write(serialize().getBytes());
            raf.writeBytes(System.getProperty("line.separator"));
            raf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Change an existing record in the file
    public void update(int id) {
        File writeTo = this.getFile();
        try {
            RandomAccessFile raf = new RandomAccessFile(writeTo, "rw");
            long pos = (id - 1) * (getRecordSize()); // + 2
            raf.seek(pos);
            raf.write(serialize().getBytes());
            raf.writeBytes(System.getProperty("line.separator"));
            raf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Extract a single record from the file
    public String read(int id) {
        File readFrom = this.getFile();
        try {
            RandomAccessFile raf = new RandomAccessFile(readFrom, "r");
            long pos = (id - 1) * (getRecordSize()); // + 2
            raf.seek(pos);
            String data = raf.readLine();
            raf.close();
            return data;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
