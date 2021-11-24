package QLnhanvien.service;

import QLnhanvien.model.Staff;

import java.util.ArrayList;
import java.util.List;

public class ManagerServiceImpl implements IStaffManager{
    public static List<Staff> staff = new ArrayList<>();
    static {
        staff.add(new Staff("Thang", 27, "Ha Noi", 300000, 24));
        staff.add(new Staff("Thang", 27, "Ha Noi", 300000, 24));
        staff.add(new Staff("Thang", 27, "Ha Noi", 300000, 24));
        staff.add(new Staff("Thang", 27, "Ha Noi", 300000, 24));
    }

    @Override
    public List<Staff> findAll() {
        return null;
    }
}
