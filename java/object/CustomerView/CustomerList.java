package CustomerView;

/*�ͻ�������*/

public class CustomerList
{
    private Customer[] customers;
    private int total = 0;  //������

    //����һ�����������������ڴ�ſͻ������������������ռ�
    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];
    }

    //���ӿͻ�������֮ǰ�������Ѿ�>=���鳤�ȣ�˵�����������������ӿͻ�������false
    public boolean addCustomer(Customer customer) {
        if (total < customers.length) {
            customers[total] = customer;
            total += 1;  //����һ���ͻ�����������һ
            return true;
        } else {
            return false;
        }
    }

    //�޸Ŀͻ����������indexԽ�磬���������鷶Χ�ڣ����޸ģ�����false
    public boolean replaceCustomer(int index, Customer customer) {
        if (index >= 0 && index < customers.length) {
            customers[index] = customer;
            return true;
        } else {
            return false;
        }
    }

    //ɾ���ͻ���ԭ��Ϊ������ɾ�ͻ����ÿһ��Ԫ��������ǰ�ƶ�һ��λ�ã�
    //�������indexԽ�磬��ɾ��������false
    public boolean deleteCustomer(int index) {
        if (index >= 0 && index < customers.length) {
            if (customers[index] == null || customers[index] == null) {
                return false;
            }
            for (int i = index; i < customers.length - 1; i++) {
                customers[i] = customers[i + 1];
            }
            customers[total - 1] = null;  //ѭ���ǵ�����Ԫ��ǰ�ƣ���ʱ���һ��λ�õ����ݻ��ڣ���˽���λ���ÿգ�
            total -= 1;                   //����ɾ�����Ƿ�Ϊ���һ��Ԫ�أ������һ��Ԫ���ÿռ��ɽ�����⡣
            return true;
        } else {
            return false;
        }
    }

    //������������
    public Customer[] getAllCustomers() {
        return customers;
    }

    //����ָ��������Ԫ��
    public Customer getCustomer(int index) {
        return customers[index];
    }
}