public interface Computers
{
	abstract public void create();
	abstract public void retrieve();
	abstract public void update();
	abstract public void delete();
	
}

class Homepc implements Computers
{
	public void create()
	{
		System.out.println("file created");

	}
	public void retrieve()
	{
		System.out.println("file retrieved");

	}
	public void update()
	{
		System.out.println("file updated");

	}
	public void delete()
	{
		System.out.println("file deleted");

	}
}

class Webserver implements Computers
{
	public void create()
	{
		System.out.println("user created");

	}
	public void retrieve()
	{
		System.out.println("user info retrieved");

	}
	public void update()
	{
		System.out.println("user info updated");

	}
	public void delete()
	{
		System.out.println("user deleted");

	}
}

class Mobile implements Computers
{
	public void create()
	{
		System.out.println("New contact created");

	}
	public void retrieve()
	{
		System.out.println("Cantact info retrieved");

	}
	public void update()
	{
		System.out.println("Contact info updated");

	}
	public void delete()
	{
		System.out.println("Contact deleted");

	}
}

class Mainmethod2
{
	public static void main(String[] args)
	{
		Homepc h=new Homepc();
		Webserver w=new Webserver();
		Mobile m= new Mobile();
		h.create();
		h.retrieve();
		h.update();
		h.delete();
		w.create();
		w.retrieve();
		w.update();
		w.delete();
		m.create();
		m.retrieve();
		m.update();
		m.delete();


	}
}

