package net.print.kt03.request

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET


interface GitHubService {
    @GET("/enbandari/Kotlin-Tutorials/stargazers")
    fun getStarGazers(): Call<List<User>>
}

object Service {

    // 懒加载，val read-only
    val gitHubService: GitHubService by lazy {

        val gson = GsonBuilder().setLenient()
                .create()

        Retrofit.Builder().baseUrl("https://github.com")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build().create(GitHubService::class.java)
    }
}

/**
 * 数据解析异常
 */
fun main(args: Array<String>) {

    val str = Service.gitHubService.getStarGazers().execute().body()
    print(str)

}
