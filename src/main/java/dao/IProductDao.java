package dao;

import model.Product;

import java.sql.SQLException;
import java.util.List;

public interface IProductDao {
    public void insertProduct(Product product);
    public Product selectProduct(int id);
    public List<Product> selectAllProduct();
    public boolean deleteProduct(int id) throws SQLException;
    public boolean updateProduct(Product product) throws SQLException;

}
