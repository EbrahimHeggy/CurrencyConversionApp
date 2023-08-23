package dev.currency_conversion_app.data.remote.model

data class SupportedCodes(
    val result: String,
    val documentation: String,
    val termsOfUse: String,
    val supportedCodes: List<Pair<String, String>>
)
