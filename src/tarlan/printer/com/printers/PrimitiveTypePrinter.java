package tarlan.printer.com.printers;

/**
 * PrimitiveTypePrinter is responsible for printing primitive types wrapped in their corresponding wrapper classes.
 */
public class PrimitiveTypePrinter implements PrinterType {

    /**
     * The value to be printed, stored as an Object.
     */
    private final Object value;

    /**
     * Constructs a PrimitiveTypePrinter with the given Integer value.
     *
     * @param value the Integer value to be printed.
     */
    public PrimitiveTypePrinter(final Integer value) {
        this.value = value;
    }

    /**
     * Prints the stored value to the standard error stream.
     */
    @Override
    public void print() {
        System.out.println(value);
    }
}
