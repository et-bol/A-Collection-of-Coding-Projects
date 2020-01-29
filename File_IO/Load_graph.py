import matplotlib.pyplot as plt


def read_file():
    try:
        file = open('Pop_file.txt', 'r')
        x_cords = []
        y_cords = []
        x = file.readline()
        while x != '':
            x_cords.append(int(x))
            y = file.readline()
            y_cords.append(int(y))
            x = file.readline()
        file.close()
        return x_cords, y_cords
    except IOError:
        print('Something went wrong with finding the file')
    except Exception as exp:
        print(exp)


def line_graph(x_cords, y_cords):
    plt.xlabel('Years')
    plt.xlim(left=1, right=15)
    plt.xticks([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15])
    plt.ylabel('Population')
    plt.yticks([100, 200, 300, 400, 500, 600, 700, 800, 900, 1000])
    plt.ylim(bottom=100, top=1000)
    plt.title('Population Growth')
    plt.plot(x_cords, y_cords, marker='o')
    plt.grid()
    plt.show()


def bar_graph(x_cords, y_cords):
    bar_width = 0.4
    plt.bar(x_cords, y_cords, bar_width, color='r')
    plt.ylim(bottom=0, top=1000)
    plt.yticks([0, 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000])
    plt.title('Population Growth')
    plt.xlabel('Years')
    plt.ylabel('Population')
    plt.xticks([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15])
    plt.show()


def main():
    x_cords, y_cords = read_file()
    choice = int(input('1 for Line Graph, 2 for Bar Graph:  '))
    if choice == 1:
        line_graph(x_cords, y_cords)
    elif choice == 2:
        bar_graph(x_cords, y_cords)
    else:
        print('Error')


main()
