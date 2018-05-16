package snakecamel;

public class Main {
	
	public void test(){
	SnakeCamelUtil scu = new SnakeCamelUtil();
	String[] exam = {"a","xyz","A","Xyz","abc","abc_def","abc_def_gh",
			"abc_def__gh","_abc_def__","Abc","AbcDef","AbcDefGh" };
	String[] answer = new String[12];
	
		for(int i = 0; i<12; i++){
			if(i<2){
			answer[i] = scu.capitalize(exam[i]);
			}
			else if(i<4){
				answer[i] = scu.uncapitalize(exam[i]);
			}
			else if (i<9){
				answer[i] = scu.snakeToCamelcase(exam[i]);
			}
			else if (i<12){
				answer[i] = scu.camelToSnakecase(exam[i]);
			}
		}
		for(int m=0; m<12; m++){
			System.out.println(answer[m]);
		}
	}
}
