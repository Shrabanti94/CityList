package com.example.citylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


        /* This is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();


            /* This adds a city to the list if that city does not exist
     * @param city @param city form add()
     *      This is the city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }


          /*  returns a sorted list of cities
     * @return return getCities()
     *
             */
    public List<City> getCities() {
        List<City> cityList = cities;
        Collections.sort(cityList);
        return cityList;
    }

    /*
            * @param city  deletes city
     */
    //solution of Task i
    public void delete(City city){
        if(!cities.contains(city)){
            throw new IllegalArgumentException();
        }
        else{
            cities.remove(city);
        }
    }

    /*
            * @return
            * returns how many cities
     */
    //solution of Task ii
    public int count(){
        return cities.size();
    }

    /*  returns the sorted list
     * @param flag  sort CityList based on City name and Province name
     * @return  getCitiesSort
     */
    //solution of Task iii
    public List<City> getCitiesSort(int flag) {
        List<City> cityList = cities;
        if(flag==1){
            Collections.sort(cityList);
        }
        else{
            Collections.sort(cityList, new Comparator<City>() {
                @Override
                public int compare(City city, City t1) {
                    return city.getProvinceName().compareTo(t1.getProvinceName());
                }
            });
        }

        return cityList;
    }

}