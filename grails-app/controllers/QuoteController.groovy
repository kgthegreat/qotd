class QuoteController {

    def index = { 
      redirect(action:home)
    }
    
    def home = {
      render "<h1>Real programmers need no syntax highlighting"
    }

    def random = {

      def allQuotes = Quote.list()
      def randomQuote
      if (allQuotes.size()>0) {
	def randomIdx = new Random().nextInt(allQuotes.size())
	println randomIdx
	randomQuote = allQuotes[randomIdx]
      }
      else 
	{
	  randomQuote = new Quote(author:'non db',content:'haha')
	}
      [quote: randomQuote]


      //  def statAuthor = "Anon."
      // def statQuote = new Quote(author:"Anon",content:"Real programmers can fly just by using M-x fly-mode")
      // [quote: statQuote]
    }
}
