package dev.currency_conversion_app.data.remote.model

data class PairConvert(
    val result: String,
    val documentation: String,
    val termsOfUse: String,
    val timeLastUpdateUnix: Long,
    val timeLastUpdateUtc: String,
    val timeNextUpdateUnix: Long,
    val timeNextUpdateUtc: String,
    val baseCode: String,
    val targetCode: String,
    val conversionRate: Double
)
