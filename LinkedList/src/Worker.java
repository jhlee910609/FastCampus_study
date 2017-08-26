public class Worker {
	public String name;
	public Worker prev;
	public Worker next;

	Worker(String str) {
		name = str;
		prev = null;
		next = null;
		System.out.println(name + "New Created, Sir!");
	}

	public String getName() {
		return name;
	}

	public void printMyName() {
		System.out.println("My Name is " + name + ", Sir!");
	}

	public void printPrevName() {
		System.out.println("Prev Worker is " + prev.getName() + ", Sir!");
	}

	public void printNextName() {
		System.out.println("Next Worker is " + next.getName() + ", Sir!");
	}

	public void addNextWorker(String inputName) {
		Worker nextWorker = new Worker(inputName);
		this.next.prev = nextWorker;
		nextWorker.next = this.next;

		this.next = nextWorker;
		nextWorker.prev = this;
	}

	public void removeNextWorker() {
		this.next.next.prev = this;
		this.next = this.next.next;
	}
}