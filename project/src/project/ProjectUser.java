/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

 public class ProjectUser {
        private String cus;
        private String tel;
        private String resp;
        private String projName;
        private String date;
        private String status;

        public ProjectUser(String cus, String tel, String resp, String projName, String date, String status) {
            this.cus = cus;
            this.tel = tel;
            this.resp = resp;
            this.projName = projName;
            this.date = date;
            this.status = status;
        }

        public String getCustomer() {
            return cus;
        }
        
        public String getTelephone() {
            return tel;
        }
        
        public String getResponsibility() {
            return resp;
        }

        public String getProjectName() {
            return projName;
        }

        public String getDate() {
            return date;
        }

        public String getStatus() {
            return status;
        }
    }