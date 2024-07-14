package spclass;

import java.util.*;

import com.sun.org.apache.bcel.internal.generic.LSTORE;

public class QuestionAndAnswer1 {

	private String qid , qname;
	private List<String> ans;
	
	public QuestionAndAnswer1(String qid, String qname, List<String> ans) {
		super();
		this.qid = qid;
		this.qname = qname;
		this.ans = ans;
	}
	
	public void show() {
		
		System.out.println("Question ID : " + qid);
		System.out.println("Question Name : " + qname);
		System.out.println("Answers are ...");
		Iterator<String> ite = ans.iterator();
		while(ite.hasNext()) {
			String value = ite.next();
			System.out.println("\t" + value);
		}
	}
}
