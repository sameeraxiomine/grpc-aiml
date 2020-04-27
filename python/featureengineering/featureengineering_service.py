
def engineer_features(event_list):
    output = {}
    f1 = 0
    f2 = 0
    f3 = 0
    f4 = 0
    for event in event_list:
        f1 = f1 + event.f1
        f2 = f2 + event.f2
        f3 = f3 + event.f3
        f4 = f4 + event.f4

    output['f1'] = f1
    output['f2'] = f2
    output['f3'] = f3
    output['f4'] = f4

    print(output)
    return output







