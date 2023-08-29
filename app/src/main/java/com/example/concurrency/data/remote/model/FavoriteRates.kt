
// What I will POST
data class FavoriteRates(
    val data: FavoriteData,
    val isSuccess: Boolean,
    val statusCode: Int
)

data class FavoriteCurrency(
    val code: String,
    val imageUrl: String,
    val name: String,
    val rate: Double
)

data class FavoriteData(
    val base: String,
    val currencies: List<FavoriteCurrency>
)