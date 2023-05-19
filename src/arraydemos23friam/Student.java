
package arraydemos23friam;


public class Student {
    // comment added at 9:27am
    private String sId;
    private String sName;
    private String phoneNum;
    
    public Student(String sId, String sName) {
        this.sId = sId;
        this.sName = sName;
    }   
    
    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }
    
    
    
}
