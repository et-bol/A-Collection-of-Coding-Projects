import matplotlib.pyplot as plt


# Salmon Returns
def main():
    left_edges = [0, 1, 2, 3, 4]
    heights = [2563, 1987, 3421, 3645, 2879]

    bar_width = 0.4

    plt.bar(left_edges, heights, bar_width, color=('b', 'g', 'c', 'k', 'r'))

    plt.ylim(ymin=0, ymax=4000)

    plt.title('Salmon Returns')
    plt.xlabel('Year')
    plt.ylabel('Amt of Salmon')

    plt.xticks(left_edges,
               ("2000", "2001", "2002", "2003", "2004"))

    plt.show()


main()
