package tarlan.printer.com.printers;

/**
 * PrinterType is an interface for classes that implement a print functionality.
 * It defines a standard format for printing values.
 */
public interface PrinterType {

    /**
     * A constant format string used for printing values.
     */
    public static String PRINT_FORMAT_STRING = "(value: %s)";

    /**
     * Prints the value(s) associated with the implementing class.
     */
    public void print();
}
