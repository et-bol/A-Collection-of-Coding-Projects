import tkinter


class MyGUI:
    def __init__(self):
        self.main_window = tkinter.Tk()
        self.canvas = tkinter.Canvas(self.main_window, width=160, height=160)
        self.canvas.create_polygon(60, 20, 100, 20, 140, 60, 140, 100, 100, 140, 60, 140, 20, 100, 20, 60, fill='blue',
                                   outline='black', width=2)
        self.canvas.pack()
        tkinter.mainloop()


my_gui = MyGUI()
