package com.aleangelozi.android_architectures_kotlin.mvc

import com.aleangelozi.android_architectures_kotlin.model.CountriesService
import com.aleangelozi.android_architectures_kotlin.model.Country
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.observers.DisposableSingleObserver
import io.reactivex.rxjava3.schedulers.Schedulers
import java.util.*

class CountriesController(view:MVCActivity) {

    private val context: MVCActivity = view
    private val service: CountriesService = CountriesService()

    init {
        fetchCountries()
    }

    private fun fetchCountries() {
        service.getCountries()
            .subscribeOn(Schedulers.newThread())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeWith(object : DisposableSingleObserver<List<Country>>() {
                override fun onSuccess(t: List<Country>?) {
                    val countryNames: MutableList<String> = ArrayList()

                    if (t != null) {
                        for (country in t) {
                            countryNames.add(country.countryName)
                        }
                        context.setValues(countryNames)
                    }
                }

                override fun onError(e: Throwable?) {
                    context.onError()
                }

            })
    }

    fun onRefresh() = fetchCountries()

}