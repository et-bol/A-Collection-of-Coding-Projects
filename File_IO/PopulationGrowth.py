import matplotlib.pyplot as plt


def create_points(start, growth):
    y_cords = []
    pop = start
    y_cords.append(pop)
    for x in range(10):
        pop += (start * growth) * x
        y_cords.append(pop)
    return y_cords


def main():
    start = 200
    growth_rate = 1.05

    x_cords = (0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    plt.xlabel('Year')
    plt.xticks(x_cords, [2000, 2001, 2002, 2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010])

    y_cords = create_points(start, growth_rate,)
    plt.ylabel('Population')

    plt.plot(x_cords, y_cords)
    plt.grid()
    plt.show()


main()
