class ThreadExceptionDemo extends Thread {
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted");
        }
    }

    public static void main(String[] args) {
        ThreadExceptionDemo t = new ThreadExceptionDemo();
        t.start();
        t.interrupt();
    }
}
