package com.tts.day3.factory;


public class DepartmentFactory
{
    public static Department CreateDepartment(DepartmentNames name)
    {
        Department d = null;

        if (name == null)
            return null;

        switch(name)
        {
            case SERVICE:
                d = new ServiceDepartment();
                break;
            case SALES:
                d = new SalesDepartment();
                break;
            case FINANCE:
                d = new FinanceDepartment();
                break;
            default:
                d = null;
                // no op
        }
        return d;
    }
}