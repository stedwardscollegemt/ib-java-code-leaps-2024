package helpers;

import java.io.*;

/**
 * This is a helper class to help students accept user input from the keyboard
 * in their programs.
 *
 * @author Teleskola.mt
 * @version 0.1
 */
public class Keyboard
{
    // Usage: String strInput = Keyboard.readString();
    public static String readString() {
        BufferedReader br;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            return br.readLine();
        } catch (Exception e) {
    
        }
        return null;
    }
    
    // Usage: int intInput = Keyboard.readInt();
    public static int readInt() {
        return Integer.parseInt(readString());
    }
    
    // Usage: byte byteInput = Keyboard.readByte();
    public static byte readByte(){
        return Byte.parseByte(readString());
    }

    // Usage: short shortInput = Keyboard.readShort();
    public static short readShort(){
        return Short.parseShort(readString());
    }

    // Usage: long longtInput = Keyboard.readLong();
    public static long readLong(){
        return Long.parseLong(readString());
    }

    // Usage: float floatInput = Keyboard.readFloat();
    public static float readFloat(){
        return Float.parseFloat(readString());
    }

    // Usage: double doubleInput = Keyboard.readDouble();
    public static double readDouble(){
        return Double.parseDouble(readString());
    }

    // Usage: char charInput = Keyboard.readChar();
    public static char readChar(){
        return readString().charAt(0);
    }

    // Usage: boolean booleanInput = Keyboard.readBoolean();
    public static boolean readBoolean(){
        return Boolean.parseBoolean(readString());
    }
}