package tarlan.printer.com;

import tarlan.printer.com.helper.TreeNode;
import tarlan.printer.com.printers.TreeNodeVerticalPrinter;

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
}
