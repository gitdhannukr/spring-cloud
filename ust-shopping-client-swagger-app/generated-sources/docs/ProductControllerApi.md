# ProductControllerApi

All URIs are relative to *https://localhost:8070*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteProductUsingDELETE**](ProductControllerApi.md#deleteProductUsingDELETE) | **DELETE** /product/{productId} | deleteProduct
[**filterProductByPriceUsingGET**](ProductControllerApi.md#filterProductByPriceUsingGET) | **GET** /product/filterProductByPrice/{lowerRange}/{upperRange} | find product by giving lower and upper range bound
[**getProductUsingGET**](ProductControllerApi.md#getProductUsingGET) | **GET** /product/{productId} | getProduct
[**getProductsUsingGET**](ProductControllerApi.md#getProductsUsingGET) | **GET** /product | getProducts
[**saveProductUsingPOST**](ProductControllerApi.md#saveProductUsingPOST) | **POST** /product | saveProduct
[**updateProductUsingPUT**](ProductControllerApi.md#updateProductUsingPUT) | **PUT** /product | updateProduct


<a name="deleteProductUsingDELETE"></a>
# **deleteProductUsingDELETE**
> String deleteProductUsingDELETE(productId)

deleteProduct

### Example
```java
// Import classes:
//import com.swagger.client.codegen.rest.invoker.ApiException;
//import com.swagger.client.codegen.rest.api.ProductControllerApi;


ProductControllerApi apiInstance = new ProductControllerApi();
Integer productId = 56; // Integer | productId
try {
    String result = apiInstance.deleteProductUsingDELETE(productId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductControllerApi#deleteProductUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **Integer**| productId |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="filterProductByPriceUsingGET"></a>
# **filterProductByPriceUsingGET**
> List&lt;Product&gt; filterProductByPriceUsingGET(lowerRange, upperRange)

find product by giving lower and upper range bound

hey you van product on price for example:1900-3000

### Example
```java
// Import classes:
//import com.swagger.client.codegen.rest.invoker.ApiException;
//import com.swagger.client.codegen.rest.api.ProductControllerApi;


ProductControllerApi apiInstance = new ProductControllerApi();
Integer lowerRange = 56; // Integer | lowerRange
Integer upperRange = 56; // Integer | upperRange
try {
    List<Product> result = apiInstance.filterProductByPriceUsingGET(lowerRange, upperRange);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductControllerApi#filterProductByPriceUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lowerRange** | **Integer**| lowerRange |
 **upperRange** | **Integer**| upperRange |

### Return type

[**List&lt;Product&gt;**](Product.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getProductUsingGET"></a>
# **getProductUsingGET**
> Product getProductUsingGET(productId)

getProduct

### Example
```java
// Import classes:
//import com.swagger.client.codegen.rest.invoker.ApiException;
//import com.swagger.client.codegen.rest.api.ProductControllerApi;


ProductControllerApi apiInstance = new ProductControllerApi();
Integer productId = 56; // Integer | productId
try {
    Product result = apiInstance.getProductUsingGET(productId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductControllerApi#getProductUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **Integer**| productId |

### Return type

[**Product**](Product.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getProductsUsingGET"></a>
# **getProductsUsingGET**
> List&lt;Product&gt; getProductsUsingGET()

getProducts

### Example
```java
// Import classes:
//import com.swagger.client.codegen.rest.invoker.ApiException;
//import com.swagger.client.codegen.rest.api.ProductControllerApi;


ProductControllerApi apiInstance = new ProductControllerApi();
try {
    List<Product> result = apiInstance.getProductsUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductControllerApi#getProductsUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Product&gt;**](Product.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="saveProductUsingPOST"></a>
# **saveProductUsingPOST**
> String saveProductUsingPOST(product)

saveProduct

### Example
```java
// Import classes:
//import com.swagger.client.codegen.rest.invoker.ApiException;
//import com.swagger.client.codegen.rest.api.ProductControllerApi;


ProductControllerApi apiInstance = new ProductControllerApi();
Product product = new Product(); // Product | product
try {
    String result = apiInstance.saveProductUsingPOST(product);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductControllerApi#saveProductUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product** | [**Product**](Product.md)| product |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateProductUsingPUT"></a>
# **updateProductUsingPUT**
> String updateProductUsingPUT(product)

updateProduct

### Example
```java
// Import classes:
//import com.swagger.client.codegen.rest.invoker.ApiException;
//import com.swagger.client.codegen.rest.api.ProductControllerApi;


ProductControllerApi apiInstance = new ProductControllerApi();
Product product = new Product(); // Product | product
try {
    String result = apiInstance.updateProductUsingPUT(product);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductControllerApi#updateProductUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product** | [**Product**](Product.md)| product |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

