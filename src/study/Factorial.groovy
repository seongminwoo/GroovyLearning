package study

class Factorial {
	static main(args) {
		for(m in 0..<10)
			println "$m! = ${new Factorial().factorial(m)}"
	}
	
	def factorial(n) {
		return recursiveFactorial(1, n)
	}
	
	def recursiveFactorial(v, k) {
		if(k<=1) return v
		else recursiveFactorial(v*k, k-1)
	}
}
