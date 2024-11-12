class AnonymousSurvey:
    """
    collect anonymous answer to survey question
    """
    def __init__(self, question):
        self.question=question
        self.response=[]
    
    def show_question(self):
        print(self.question)
        
    def collect_response(self, new_response):
        self.response.append(new_response)
        
    def show_response(self):
        print("Here are respond of the servey:")
        for response in self.response:
            print(f"\t-{response}")