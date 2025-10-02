import ollama

from ollama import chat
from ollama import ChatResponse

from pathlib import Path

KOTLIN_PROMPT_BEFORE = """
This is a Kotlin code snippet that contains one or more bugs. 
Fix the bug(s) in the code and return the fixed code snippet.
"""

KOTLIN_PROMPT_AFTER = """
Here are some examples of mutation operators that could be used to fix the bug(s) in the code: 

•	Delete lines of code. 
•	Copy lines of code and insert them in other parts of the code. 
•	Change the type of a variable. 
•	Insert library import statements.
•	Insert skeleton code for Kotlin-specific concepts or keywords, such as the ‘when’ expression, ‘set’ statement, the ‘in’ or ‘!in’ keyword and the ‘?.let’ concept.
"""


SWIFT_PROMPT_BEFORE = """This is a Swift code snippet that contains one or more bugs. 
Fix the bug(s) in the code and return the fixed code snippet."""

SWIFT_PROMPT_AFTER = """
Here are some examples of mutation operators that could be used to fix the bug(s) in the code: 

•	Delete lines of code. 
•	Copy lines of code and insert them in other parts of the code. 
•	Change the type of a variable. 
•	Insert library import statements.
•	Insert skeleton code for Swift-specific concepts or keywords, such as the ‘switch’ statement, the ‘willSet’ statement, the ‘!’ keyword for forced unwrapping, the ‘guard-let’ concept and the shortform ‘enum’ concept.
"""
def request(source_code, prompt_before, prompt_after):

    # contact codellama 
    response: ChatResponse = chat(model='codellama:7b-instruct', messages=[
    {
        'role': 'user',
        'content': prompt_before + source_code + prompt_after,
    },
    ])
    # print(response['message']['content'])
    return response['message']['content']

def read_file(file_path):
    with open(file_path, 'r', encoding='utf-8') as file:
        return file.read()

def save_response(response, output_file_name):
    with open(output_file_name, 'w', encoding='utf-8') as file:
        file.write(response)

def iterate_directory_kotlin(input_folder, output_folder):
    folder_path = Path(input_folder)
    output_dir = Path(output_folder)
    # CHANGEEEEEEEEEEEEEE
    for file_path in folder_path.glob("7_ErrorHandling_3.kt"):
        if file_path.is_file():
            print(f"Processing: {file_path.name}")
            source_code = read_file(file_path)
            response = request(source_code, KOTLIN_PROMPT_BEFORE, KOTLIN_PROMPT_AFTER)
            save_response(response, output_dir / file_path.name)
            print(f"Saved: {output_dir / file_path.name}")

def iterate_directory_swift(input_folder, output_folder):
    folder_path = Path(input_folder)
    output_dir = Path(output_folder)
    for file_path in folder_path.glob("*.swift"):
        if file_path.is_file():
            print(f"Processing: {file_path.name}")
            source_code = read_file(file_path)
            response = request(source_code, SWIFT_PROMPT_BEFORE, SWIFT_PROMPT_AFTER)
            save_response(response, output_dir / file_path.name)
            print(f"Saved: {output_dir / file_path.name}")

if __name__ == "__main__":

    # # SequalsK Kotlin 
    # input_folder = "BrokenCode/CodeLlama_Kotlin"
    # output_folder = "FixedCode/CodeLlama_Kotlin"
    # iterate_directory_kotlin(input_folder, output_folder)

    # # SequalsK Swift
    # input_folder = "BrokenCode/CodeLlama_Swift"
    # output_folder = "FixedCode/CodeLlama_Swift"
    # iterate_directory_swift(input_folder, output_folder)

    # # CodeLlama Kotlin
    # input_folder = "BrokenCode/SequalsK_Kotlin"
    # output_folder = "FixedCode/SequalsK_Kotlin"
    # iterate_directory_kotlin(input_folder, output_folder)

    # # CodeLlama Swift
    # input_folder = "BrokenCode/SequalsK_Swift"
    # output_folder = "FixedCode/SequalsK_Swift"
    # iterate_directory_swift(input_folder, output_folder)

    input_folder = "BrokenCode/CodeLlama_Kotlin"
    output_folder = "FixedCode/CodeLlama_Kotlin"
    iterate_directory_kotlin(input_folder, output_folder)