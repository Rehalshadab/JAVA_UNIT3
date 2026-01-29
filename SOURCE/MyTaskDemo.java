class MyTask implements Runnable {
public void run() {
System.out.println("Task running in thread: " +
Thread.currentThread().getName());

}
public static void main(String[] args) {
MyTask task = new MyTask();
Thread t1 = new Thread(task);
Thread t2 = new Thread(task);
t1.start();
t2.start();
}
}
