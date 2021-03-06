package org.example.service.staff;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.dao.staff.StaffDao;
import org.example.exception.address.UnknownAddressException;
import org.example.exception.staff.InvalidStaffException;
import org.example.exception.staff.StaffInUseException;
import org.example.exception.staff.UnknownStaffException;
import org.example.exception.store.UnknownStoreException;
import org.example.model.Staff;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Slf4j
@RequiredArgsConstructor
@Service
public class StaffServiceImpl implements StaffService {

    private final StaffDao staffDao;

    @Override
    public Collection<Staff> readAll() {
        return staffDao.readAll();
    }

    @Override
    public void createStaffMember(Staff staff) throws UnknownAddressException, UnknownStoreException, InvalidStaffException {
        staffDao.createStaffMember(staff);
    }

    @Override
    public void updateStaffMember(int staffId, Staff staff) throws UnknownAddressException, UnknownStaffException, UnknownStoreException, InvalidStaffException {
        staffDao.updateStaffMember(staffId,staff);
    }

    @Override
    public void deleteStaffMember(int staffId) throws StaffInUseException, UnknownStaffException {
        staffDao.deleteStaffMember(staffId);
    }
}
