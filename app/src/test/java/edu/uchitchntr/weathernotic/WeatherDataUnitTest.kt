package edu.uchitchntr.weathernotic

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import org.junit.Test

import org.junit.Assert.*
import org.junit.Rule
import org.junit.rules.TestRule

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class WeatherDataUnitTest {
    @get:Rule
    //var rule: TestRule = InstantTaskExecutorRule()
    var rule: TestRule = InstantTaskExecutorRule()

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun getJsonData_hasData() {
        assertEquals(4, 2 + 2)
    }
}