package patterns.queuedemo;

public class queuearray {
    static class Queue {
        int arr[] = new int[5];
        int front = 0, rear = -1;

        void enqueue(int x) {
            if (rear == 4) {
                System.out.println("Queue Overflow");
            } else {
                arr[++rear] = x;
                System.out.println("Inserted: " + x);
            }
        }

        void dequeue() {
            if (front > rear) {
                System.out.println("Queue Underflow");
            } else {
                System.out.println("Removed: " + arr[front++]);
            }
        }

        void display() {
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            Queue q = new Queue();
            q.enqueue(10);
            q.enqueue(20);
            q.enqueue(30);
            q.display();
            q.dequeue();
            q.display();
        }
    }
}
