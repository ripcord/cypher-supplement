/*package edu.sunypoly.cypher.backend.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

import edu.sunypoly.cypher.db.*;

public class GradingModuleHandler
{

	
	public static void gradeSubmission(ProgCompSubmission submission) throws IOException 
	{
		db = new Mis("jdbc:mysql://localhost/cypher_db?useSSL=false", "cypher", "cypher");
		String code = new String(db.Problem.getTestCode(submission.ProblemNumber));
		
		File F = File.createTempFile(""+submission.TeamID+submission.ProblemNumber, "py");
		
		FileWriter fw = new FileWriter(F);
		fw.write(code);
		fw.flush();
		fw.close();
		
		Process P = Runtime.getRuntime().exec("python3 " + F.getAbsolutePath());
		
		OutputStream InputsToProg = P.getOutputStream();
		Scanner OutputsFromProg = new Scanner(P.getInputStream());
		
		InputsToProg.write(submission.result.getBytes());
		submission.score = OutputsFromProg.next();
		
		OutputsFromProg.close();
		InputsToProg.close();
		F.delete();
		
	}
	
	
	private static Mis db;
}

*/
