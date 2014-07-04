package study

class WordCount {

	static main(args) {
		System.out.println("please input sentences>");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
		def lineCount=0, wordCount=0,charCount=0 
		
		br.readLines().each {
			lineCount++
			wordCount+=it.trim().split("\\s+").length
			charCount+=it.length()
		}
		
		println "lineCount: $lineCount"
		println "wordCoun: $wordCount"
		println "charCount: $charCount"
	}

}
