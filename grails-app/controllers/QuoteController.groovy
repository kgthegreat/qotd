class QuoteController {

    def index = { 
      redirect(action:home)
    }
    
    def home = {
      render "<h1>Real programmers need no syntax highlighting"
    }

    def random = {
      def statAuthor = "Anon."
      def statQuote = "Real programmers can fly just by using M-x fly-mode"
      [author: statAuthor, content: statQuote]
    }
}
