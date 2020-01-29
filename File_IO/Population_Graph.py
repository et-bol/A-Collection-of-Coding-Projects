def get_data():
    try:
        limit = int(input('Enter the Population Limit:  '))
        starting_pop = int(input('Enter the Starting Population:  '))
        growth_rate = float(input('Enter growth rate:  '))
        years_to_graph = int(input('Enter How Many Years To Graph:  '))
        return limit, starting_pop, growth_rate, years_to_graph
    except ValueError:
        print('ERROR:\tPlease Enter The Correct Data Type')


def write_data(limit, start, growth, years):
    x_cords = []
    for i in range(1, years + 1):
        x_cords.append(i)
    y_cords = []
    pop = start
    for i in range(years):
        pop += int((growth * pop) * ((limit - pop) / limit))
        y_cords.append(pop)

    file = open('Pop_file.txt', 'w')
    for i in range(years):
        file.write(str(x_cords[i]) + '\n')
        file.write(str(y_cords[i]) + '\n')
    file.close()


def main():
    limit, start, growth, years = get_data()
    write_data(limit, start, growth, years)


main()
