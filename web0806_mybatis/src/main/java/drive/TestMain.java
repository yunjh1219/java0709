package drive;

import dept.DeptDAO;

public class TestMain {
	
	public static void main(String[] args) {
		DeptDAO dao = new DeptDAO();
		int deptno = dao.searchDeptno("SALES");
		System.out.println(deptno);
	}

}
