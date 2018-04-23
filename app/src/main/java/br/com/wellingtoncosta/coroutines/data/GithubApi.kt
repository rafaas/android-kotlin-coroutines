package br.com.wellingtoncosta.coroutines.data

import kotlinx.coroutines.experimental.Deferred
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * @author WellingtonCosta on 22/04/18.
 */
interface GithubApi {

    @GET("users")
    fun getUsers(): Deferred<List<User>>

    @GET("users/{username}")
    fun getUser(@Path("username") username: String): Deferred<User>

}