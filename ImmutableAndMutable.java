/* a)  Write the  programme for the class ImmutableExample, to achieve object value "Hii". */


package hello1;


public final class ImmutableExample {

	private String name;
	ImmutableDemo (String name) {
	this.name = name;
	}
	public String getName() {
	return name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


ImmutableDemo obj = new ImmutableDemo("Hii");
System.out.println(obj.getName());
//obj.setName("Hii");
System.out.println(obj.getName());
}
}

/* Expected Output:
Hii
Hii
*/

/*b) Write the  programme for the class
MutableExample, to output the object values ‘hello 2’ and ‘hello3’. */
package hello1;
public class MutableExample {
private String name;
MutableExample(String name) {
this.name = name;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public static void main(String[] args) {
MutableExample obj = new MutableExample("hello2");
System.out.println(obj.getName());
Obj.setName("hello3");
System.out.println(obj.getName());
}
}
/*Expected output:
hello2
hello3
*/
