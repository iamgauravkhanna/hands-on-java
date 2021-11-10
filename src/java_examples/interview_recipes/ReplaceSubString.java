package java_examples.interview_recipes;

public class ReplaceSubString {

	public void replaceSubString1() {
		String str = "I use selenium webdriver. selenium is a tool for web applications automation.";
		String toBeReplaced = "selenium";
		String toReplacedWith = "Firefox";
		String[] astr = str.split(toBeReplaced);
		StringBuffer strb = new StringBuffer();
		for (int i = 0; i <= astr.length - 1; i++) {
			strb = strb.append(astr[i]);
			if (i != astr.length - 1) {
				strb = strb.append(toReplacedWith);
			}
		}
		System.out.println(strb);
	}

	public void replaceSubString2() {

		String str = "I use selenium webdriver. selenium is a tool for web applications automation.";

		String toBeReplaced = "selenium";

		String toReplacedWith = "Firefox";

		String updatedStr = str.replace(toBeReplaced, toReplacedWith);

		System.out.println(updatedStr);
	}

	public void replaceSubString3() {

		String str = "I use selenium webdriver. selenium is a tool for web applications automation.";

		StringBuffer stringBufferObj = new StringBuffer(str);

		System.out.println(stringBufferObj.replace(6, 14, "Firefox"));

	}

	public static void main(String args[]) {

		//
		ReplaceSubString replaceSubStringObj = new ReplaceSubString();

		//
		replaceSubStringObj.replaceSubString1();

		//
		replaceSubStringObj.replaceSubString2();

		//
		replaceSubStringObj.replaceSubString3();

	}

}
