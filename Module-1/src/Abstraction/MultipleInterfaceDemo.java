package Abstraction;

interface PrintableDevice {
    void printDocument();
}

interface ScannableDevice {
    void scanDocument();
}

class MultiFunctionPrinter implements PrintableDevice, ScannableDevice {

    @Override
    public void printDocument() {
        System.out.println("Printing document...");
    }

    @Override
    public void scanDocument() {
        System.out.println("Scanning document...");
    }
}

public class MultipleInterfaceDemo {
    public static void main(String[] args) {

        MultiFunctionPrinter printer = new MultiFunctionPrinter();

        printer.printDocument();
        printer.scanDocument();
    }
}
