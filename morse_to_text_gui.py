import tkinter


class MyGui:
    def __init__(self):
        self.main_window = tkinter.Tk()

        self.top_frame = tkinter.Frame(self.main_window)
        self.bottom_frame = tkinter.Frame(self.main_window)
        self.output_frame = tkinter.Frame(self.main_window)

        self.prompt = tkinter.Label(self.top_frame, text='Enter Text:')
        self.input_box = tkinter.Entry(self.top_frame, width=30)

        self.prompt.pack(side='left')
        self.input_box.pack(side='left')

        self.morse = tkinter.StringVar()

        self.output = tkinter.Label(self.output_frame, textvariable=self.morse)
        self.convert = tkinter.Button(self.bottom_frame, text='Convert to Morse Code', command=self.translate)

        self.convert.pack(side='left')
        self.output.pack(side='left')

        self.top_frame.pack()
        self.bottom_frame.pack()
        self.output_frame.pack()

        tkinter.mainloop()

    def translate(self):
        MORSE_CODE_DICT = {'A': '.-', 'B': '-...',
                           'C': '-.-.', 'D': '-..', 'E': '.',
                           'F': '..-.', 'G': '--.', 'H': '....',
                           'I': '..', 'J': '.---', 'K': '-.-',
                           'L': '.-..', 'M': '--', 'N': '-.',
                           'O': '---', 'P': '.--.', 'Q': '--.-',
                           'R': '.-.', 'S': '...', 'T': '-',
                           'U': '..-', 'V': '...-', 'W': '.--',
                           'X': '-..-', 'Y': '-.--', 'Z': '--..',
                           '1': '.----', '2': '..---', '3': '...--',
                           '4': '....-', '5': '.....', '6': '-....',
                           '7': '--...', '8': '---..', '9': '----.',
                           '0': '-----', ',': '--..--', '.': '.-.-.-',
                           '?': '..--..', '/': '-..-.', '-': '-....-',
                           '(': '-.--.', ')': '-.--.-', ' ': '/',
                           "'": '.----.'}
        string = self.input_box.get().upper()
        morse_string = ''
        for ch in string:
            morse_string += MORSE_CODE_DICT[ch] + ' '
        self.morse.set(morse_string)


my_gui = MyGui()
