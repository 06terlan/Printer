package tarlan.printer.com.printers;

import java.util.Arrays;

/**
 * ArrayPrinter is responsible for printing one-dimensional or two-dimensional arrays of integers
 * in a formatted string.
 */
public class ArrayPrinter implements PrinterType {

    /**
     * The one-dimensional array of integers to be printed.
     */
    private final int[] values;

    /**
     * The two-dimensional array of integers to be printed.
     */
    private final int[][] values2D;

    /**
     * Constructs an ArrayPrinter with the given one-dimensional array of integers.
     *
     * @param values the one-dimensional array of integers to be printed.
     */
    public ArrayPrinter(final int[] values) {
        this.values = values;
        this.values2D = null;
    }

    /**
     * Constructs an ArrayPrinter with the given two-dimensional array of integers.
     *
     * @param values2D the two-dimensional array of integers to be printed.
     */
    public ArrayPrinter(final int[][] values2D) {
        this.values = null;
        this.values2D = values2D;
    }

    /**
     * Prints the array of integers in a formatted string. 
     * If a one-dimensional array is provided, it prints it using Arrays.toString().
     * If a two-dimensional array is provided, it prints it using Arrays.deepToString().
     */
    @Override
    public void print() {
        if (values != null) {
            System.out.println(String.format(PRINT_FORMAT_STRING, Arrays.toString(this.values)));
        } else if (values2D != null) {
            System.out.println(String.format(PRINT_FORMAT_STRING, Arrays.deepToString(this.values2D)));
        }
    }
}
