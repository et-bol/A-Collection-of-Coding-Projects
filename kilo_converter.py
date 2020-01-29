import tkinter


class MyGui:
    def __init__(self):
        self.main_window = tkinter.Tk()

        self.top_frame = tkinter.Frame()
        self.mid_frame = tkinter.Frame()
        self.bottom_frame = tkinter.Frame()

        self.prompt_label = tkinter.Label(self.top_frame, text='Enter Kilometers:',)
        self.kilo_entry = tkinter.Entry(self.top_frame, width=10)

        self.prompt_label.pack(side='left')
        self.kilo_entry.pack(side='left')

        self.descr_label = tkinter.Label(self.mid_frame, text='Converted to miles:')

        self.value = tkinter.StringVar()

        self.miles_label = tkinter.Label(self.mid_frame, textvariable=self.value)

        self.descr_label.pack(side='left')
        self.miles_label.pack(side='left')

        self.calc_button = tkinter.Button(self.bottom_frame, text='convert', command=self.convert)

        self.calc_button.pack()

        self.top_frame.pack()
        self.mid_frame.pack()
        self.bottom_frame.pack()

        tkinter.mainloop()

    def convert(self):
        kilo = float(self.kilo_entry.get())
        miles = kilo * 0.6214
        self.value.set(format(miles, '.2f'))


kilo_conv = MyGui()
