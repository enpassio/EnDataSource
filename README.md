# EnDataSource
Standard source/sample data set used for various projects/repositories of Enpassio. There can be different datasets from various sources and hence, source attributions should be done accordingly.

### Source of news data with both hardcoded values and respective link for accessing the same data
For projects requiring some data with texts as well as image url, we'd be referring to Newsapi.org api. And the sample hardcoded data used in various projects will be: https://gist.github.com/rajtheinnovator/a45ac7e2c1ec92c4aabc72891fbf84cf

The same data as above can also be retrieved using a GET request on Newsapi.org api using the link: https://newsapi.org/v2/top-headlines?sources=bbc-news&apiKey=your-newsapidotorg-api-key

There will be three classes required to handle the response from the Newapi.org for the endpoint **/v2/top-headlines** and they can be found(*with Parcelable implemented*) separately in Java and Kotlin both. The links to those files are:


**Java** sources:

*NewsResponse* class written in Java can be found at: https://github.com/rajtheinnovator/EnDataSource/blob/master/NewsResponse.java
*Article* class written in Java can be found at: https://github.com/rajtheinnovator/EnDataSource/blob/master/Article.java
*Source* class written in Java can be found at: https://github.com/rajtheinnovator/EnDataSource/blob/master/Source.java

**Kotlin** Sources:
*NewsResponse, Article* and *Source* classes written in Kotlin can be found inside the Kotlin file named **NewsResponseKotlin.kt** at: https://github.com/rajtheinnovator/EnDataSource/blob/master/NewsResponseKotlin.kt




### Custom model classes for serving data when we're not using any api or json source to get our data
Here, we've data source which we can use whenever we want to put data from some custom model and not from any JSON source or api. This data source can also be used in case we need to implement parent child relationship in some database example project. In that case, we can make the **sellerId** as a **foreignKey** in **Product** POJO class.

There are various classes and depending upon whether the project is written in Java/Kotlin, the following are the source of those model classes:

**Java** sources:

*Product* class written in Java can be found at: https://github.com/enpassio/EnDataSource/blob/development/ProductJava.java
*Seller* class written in Java can be found at: https://github.com/enpassio/EnDataSource/blob/development/SellerJava.java
*Product* class written in Java can be found at: https://github.com/enpassio/EnDataSource/blob/development/SellerProductDataSourceJava.java

**Kotlin** Sources:
*Product, Seller* classes and *a class that returns product and sellers* written in Kotlin can be found at: https://github.com/enpassio/EnDataSource/blob/development/SellerProductDataSourceKotlin.kt
