
package generated.com.gen.wow;

import generated.com.gen.wow.model.CreateProductRequest;
import generated.com.gen.wow.model.UpdateProductByIdRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * A collection of products
 * (Generated with springmvc-raml-parser v.0.5.1)
 * 
 */
@RestController
@RequestMapping(value = "/api/products", produces = "application/json")
public interface ProductController {


    /**
     * Create a product
     * 
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity createProduct(
        @org.springframework.web.bind.annotation.RequestBody
        CreateProductRequest createProductRequest);

    /**
     * Get a list of products
     * 
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity getProducts(
        @RequestParam(required = false)
        String q);

    /**
     * Get a single product
     * 
     */
    @RequestMapping(value = "/{productId}", method = RequestMethod.GET)
    public ResponseEntity getProductById(
        @PathVariable
        Long productId);

    /**
     * Updates a single product
     * 
     */
    @RequestMapping(value = "/{productId}", method = RequestMethod.PUT)
    public ResponseEntity updateProductById(
        @PathVariable
        Long productId,
        @org.springframework.web.bind.annotation.RequestBody
        UpdateProductByIdRequest updateProductByIdRequest);

    /**
     * Delete a single product
     * 
     */
    @RequestMapping(value = "/{productId}", method = RequestMethod.DELETE)
    public ResponseEntity deleteProductById(
        @PathVariable
        Long productId);

}
