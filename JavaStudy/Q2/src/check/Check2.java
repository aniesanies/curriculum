package check;

public class Check2 {

 private String firstName;
 private String lastName;

 public Check2(String firstName, String lastName) {
 this.firstName = firstName;
 this.lastName = lastName;
    }

 protected String getFirstName() {
 return firstName;
    }

 protected String getLastName() {
 return lastName;
    }

//Q4 名前で出力結果の異なるメソッドage()を作成すること
//（①田中太郎の場合に表示するもの：田中太郎は24歳　②山田花子の場合に表示するもの：山田花子は29歳　③それ以外の場合：値は無効です）
	public void age() {
	if (firstName == "田中" && lastName == "太郎") {
		System.out.println("田中太郎は24歳");
	}	else if (firstName == "山田" && lastName == "花子") {
		System.out.println("山田花子は29歳");
	}	else {
		System.out.println("値は無効です");
	}
}

//Q8　名前が１文字づつ表示されるメソッドnameOne()を作成すること
	public void nameOne() {
	String arr = ("firstName" + "lastName");
	String[] strArray = arr.split("");
	for(String s : strArray) {
	System.out.println(s);
	}
	
	}

}