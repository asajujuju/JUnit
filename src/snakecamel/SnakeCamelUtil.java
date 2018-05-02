package snakecamel;

public class SnakeCamelUtil {

	public static String snakeToCamelcase(String snake_case) {
		String[] words = snake_case.split("_");//words[0]=abc, words[1]=def, words[2]=ghi
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < words.length; i++) {
			sb.append(capitalize(words[i]));
		}
		return new String(sb); //ひとつの単語にまとめる(AbcDefGhi)
	}
	 
		public static String camelToSnakecase(String camelcase) {
			StringBuilder sb = new StringBuilder();
			int j = 0;
			for (int i = 0; i < camelcase.length(); i++) {
				char c = camelcase.charAt(i);//camelのi番目を抜き出す
				if (Character.isUpperCase(c)) { //大文字なら
					
				 if(j!=i){
						sb.append(camelcase.substring(j, i));//camelcaseのj~iまでの文字を加える(iは含まれない)
					if (sb.length() > 0) {
						sb.append("_");
					}
				 }
					sb.append(Character.toLowerCase(c));//小文字に変換
					j=i+1;
				}
				
			}
			sb.append(camelcase.substring(j));//j番目から末尾まで
			return new String(sb);
		}
		
		
		static String capitalize(String s) {//1文字目を大文字にするクラス
			char first = s.charAt(0);
			char upperFirst = Character.toUpperCase(first);//大文字に変換
			String rest = s.substring(1);
			return upperFirst + rest;
		}
	
		static String uncapitalize(String s) {
			char first = s.charAt(0);
			char lowerFirst = Character.toLowerCase(first);
			String rest = s.substring(1);
			return lowerFirst + rest;
		}
		
		
	}
