package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchingFacadeTestSuite {
    @Autowired
    private SearchingFacade searchingFacade;
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testSearchCompanyByPartName() {
        //Given
        Company greyMatter = new Company("Grey Matter");
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");

        companyDao.save(greyMatter);
        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);

        //When
        List<Company> companies0 = searchingFacade.searchCompanyByPartName("gre");
        List<Company> companies1 = searchingFacade.searchCompanyByPartName("chin");
        List<Company> companies2 = searchingFacade.searchCompanyByPartName("mae");

        //Then
        Assert.assertEquals("Grey Matter", companies0.get(0).getName());
        Assert.assertEquals("Software Machine", companies1.get(0).getName());
        Assert.assertEquals("Data Maesters", companies2.get(0).getName());

    }

    @Test
    public void testSearchEmployeeByPartName() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        Employee stephanieClarkson = new Employee("Stephanie", "Clarkson");

        employeeDao.save(johnSmith);
        employeeDao.save(lindaKovalsky);
        employeeDao.save(stephanieClarkson);

        //When
        List<Employee> employees0 = searchingFacade.searchEmployeeByPartName("ith");
        List<Employee> employees1 = searchingFacade.searchEmployeeByPartName("val");
        List<Employee> employees2 = searchingFacade.searchEmployeeByPartName("ark");

        //Then
        Assert.assertEquals("Smith", employees0.get(0).getLastname());
        Assert.assertEquals("Kovalsky", employees1.get(0).getLastname());
        Assert.assertEquals("Clarkson", employees2.get(0).getLastname());
    }
}