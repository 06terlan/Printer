package tarlan.printer.com;

import tarlan.printer.com.helper.TreeNode;
import tarlan.printer.com.printers.ArrayPrinter;
import tarlan.printer.com.printers.PrimitiveTypePrinter;
import tarlan.printer.com.printers.tree.TreeNodeVerticalPrinter;

/**
 * Utility class for printing trees in a structured format.
 * Curretly supported formats are:
 * - TreeNode
 */
public class Printer {

    /**
     * Prints the given binary tree in a vertical, pretty-printed format.
     *
     * @param head the root of the binary tree to be printed.
     */
    public static void prettyPrint(final TreeNode head) {
        new TreeNodeVerticalPrinter(head).print();
    }

    /**
     * Prints the given integer (primitive) value using the PrimitiveTypePrinter.
     *
     * @param value the integer value to be printed.
     */
    public static void prettyPrint(final int value) {
        new PrimitiveTypePrinter(Integer.valueOf(value)).print();
    }

    /**
     * Prints the given integer value using the PrimitiveTypePrinter.
     *
     * @param value the integer value to be printed.
     */
    public static void prettyPrint(final Integer value) {
        new PrimitiveTypePrinter(value).print();
    }

    /**
     * Prints the given array of integers using the ArrayPrinter.
     *
     * @param values the array of integers to be printed.
     */
    public static void prettyPrint(final int[] values) {
        new ArrayPrinter(values).print();
    }
}
