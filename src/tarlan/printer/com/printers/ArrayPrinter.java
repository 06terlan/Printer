package tarlan.printer.com.printers;

import java.util.Arrays;

/**
 * ArrayPrinter is responsible for printing an array of integers in a formatted string.
 */
public class ArrayPrinter implements PrinterType {

    /**
     * The array of integers to be printed.
     */
    private final int[] values;

    /**
     * Constructs an ArrayPrinter with the given array of integers.
     *
     * @param values the array of integers to be printed.
     */
    public ArrayPrinter(final int[] values) {
        this.values = values;
    }

    /**
     * Prints the array of integers in a formatted string using Arrays.toString().
     */
    @Override
    public void print() {
        System.out.println(String.format(PRINT_FORMAT_STRING, Arrays.toString(this.values)));
    }
}
