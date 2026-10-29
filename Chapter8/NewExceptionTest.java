class NewExceptionTest {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException e) {
            System.out.println("Error messgae: " + e.getMessage());
            e.printStackTrace();
            System.out.println("Space is not enough, reinstall after getting enough space.");
        } catch (MemoryException me) {
            System.out.println("Error message: " + me.getMessage());
            me.printStackTrace();
            System.gc();
            System.out.println("Retry install");
        } finally {
            deleteTempFiles();
        }
    }

    static void startInstall() throws SpaceException, MemoryException {
        if(!enoughSpace())
            throw new SpaceException("Not enough space");
        if(!enoughMemory())
            throw new MemoryException("Not enough memory");
    }

    static void copyFiles() {}
    static void deleteTempFiles() {
    }
    static boolean enoughSpace() {
        return false;
    }
    static boolean enoughMemory() {
        return true;
    }
}

class SpaceException extends Exception {
    SpaceException(String msg) {
        super(msg);
    }
}

class MemoryException extends Exception {
    MemoryException(String msg) {
        super(msg);
    }
}